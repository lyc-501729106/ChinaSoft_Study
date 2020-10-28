package class0806;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;
//定时器，
public class QuartzScheduleTest {
    public static void main(String[] args) {

        try {
            //PrintQuartzTask.class：使用反射技术获取到class对象
            JobDetail jobDetail = JobBuilder.newJob(PrintQuartzTask.class)
                    .withIdentity("打印任务", Scheduler.DEFAULT_GROUP).build();
            SimpleScheduleBuilder builder = SimpleScheduleBuilder.simpleSchedule()
                    .withIntervalInSeconds(1)
                    .repeatForever();
            //触发器
            //通常情况下在创建对象的时候使用类名.new***的时候，表示当前的类是单例模式
            Trigger trigger = TriggerBuilder.newTrigger()//单例模式
                    .withIdentity("simpletrigger", Scheduler.DEFAULT_GROUP)
                    .startNow()
                    .withSchedule(builder)
                    .build();
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
            scheduler.scheduleJob(jobDetail, trigger);
            scheduler.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

