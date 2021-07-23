package Visitor.Test2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author TF014268
 * @description 完整对象结构
 * @since 2021/7/1 0001 8:54
 */
public class BigHuYouCompany {
    private List<CorporateSlave> employee= new ArrayList<>();

    public BigHuYouCompany() {
        employee.add(new Programmer("王二狗"));
        employee.add(new HumanSource("上官无需"));
        employee.add(new Tester("牛翠花"));
    }

    public void startProject(CorporateSlaveVisitor visitor){
        for (CorporateSlave slave : employee) {
            slave.accept(visitor);
        }
    }
}
