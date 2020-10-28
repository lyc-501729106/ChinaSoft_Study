package com.etc.xml0915.service;

import com.etc.xml0915.entity.School;
import com.etc.xml0915.entity.Student;
import com.etc.xml0915.entity.Tclass;
import com.etc.xml0915.util.SchoolUtil;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class XmlService {
    //创建一个单例
    private static XmlService xmlService;
    Document document;//我们需要对结点进行操作的对象
    private XmlService(File file) throws ParserConfigurationException, IOException, SAXException {
        //创建工厂实例
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        //创建Builder实例
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        //创建Document实例
        document = documentBuilder.parse(file);
    }
    public static XmlService newInstance(File file) throws IOException, SAXException, ParserConfigurationException {
        if (xmlService == null){
            xmlService = new XmlService(file);
        }
        return xmlService;
    }

    public static void main(String[] args) throws URISyntaxException, ParserConfigurationException, SAXException, IOException {
        String path = XmlService.class.getResource("/").toURI().getPath() + "School.xml";
        File file = new File(path);
        List<School> list = XmlService.newInstance(file).parseSchool();
        for (School school :
                list) {
            System.out.println("学校信息");
            System.out.println(school.getId() + " " + school.getName());
            for (Tclass tclass :
                    school.getTclassList()) {
                System.out.println("\t" + school.getName() + "学校的班级信息:");
                System.out.println("\t\t" + tclass.getId() + " " + tclass.getName());
                for (Student student :
                        tclass.getStudentList()) {
                    System.out.println("\t\t\t" + tclass.getName() + "班级的学生信息");
                    System.out.println("\t\t\t\t" + student.getId() + " " + student.getName());
                }
            }
        }
    }
    public List<School> parseSchool(){
        //创建一个集合用来存储school对象
        List<School> schoolList = new ArrayList<>();
        //判断document是否为空
        if (document != null){
            //先根据school标签获取到所有的school结点
            NodeList schools = document.getElementsByTagName(SchoolUtil.SCHOOL);
            //遍历集合
            for (int i = 0; i < schools.getLength(); i++) {
                //获取到每一个school结点
                Node school = schools.item(i);
                //判断当前的结点是否是元素结点
                if (school.getNodeType() == Node.ELEMENT_NODE){
                    //将school结点转换为element对象
                    Element sch = (Element) school;
                    int schoolid = Integer.parseInt(sch.getAttribute(SchoolUtil.ID));//getAttribute() 方法返回指定属性名的属性值。
                    String schoolname = sch.getAttribute(SchoolUtil.NAME);
                    //创建school对象
                    School school1 = new School(schoolid , schoolname);
                    //-------------------------------------
                    //通过school结点获取到的所有子结点
                    NodeList tclasses = sch.getChildNodes();
                    //遍历班级结点
                    for (int j = 0; j < tclasses.getLength(); j++) {
                        //获取到每一个班级
                        Node tclass = tclasses.item(j);
                        //判断当前的结点是否是元素结点
                        if (tclass.getNodeType() == Node.ELEMENT_NODE){
                            Element tc = (Element) tclass;
                            int tcid = Integer.parseInt(tc.getAttribute(SchoolUtil.ID));
                            String tcname = tc.getAttribute(SchoolUtil.NAME);
                            Tclass tclass1 = new Tclass(tcname,tcid,school1);

                            //通过tclass1获取到所有的子结点
                            NodeList students = tc.getChildNodes();
                            //遍历所有子结点
                            for (int k = 0; k < students.getLength(); k++) {
                                //获取到每一个学生
                                Node student = students.item(k);
                                if (student.getNodeType() == Node.ELEMENT_NODE){
                                    Element stu = (Element)student;
                                    int studentid = Integer.parseInt(stu.getAttribute(SchoolUtil.ID));
                                    String studentname = stu.getAttribute(SchoolUtil.NAME);
                                    Student student1 = new Student(studentid , studentname , tclass1);
                                }
                            }
                        }
                    }

                    schoolList.add(school1);
                }
            }
        }
        return schoolList;
    }
}

