package class0806;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class PrintQuartzTask implements Job{

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println("任务启动！" + new Date() + " by " + context.getTrigger().getCalendarName());
    }

}
