package site.tkgup.pojo;

/**
 * @author tkg
 * @create 2020-06-07 21:01
 */

public class Student
{
    private String name;

    public Address getAddr()
    {
        return addr;
    }

    public void setAddr2(Address addr)
    {
        this.addr = addr;
    }

    public Car getCar()
    {
        return car;
    }

    public void setCar(Car car)
    {
        this.car = car;
    }

    private Address addr;
    private Car car;

    @Override
    public String toString()
    {
        return "Student{" + "name='" + name + '\'' + ", addr=" + addr + ", car=" + car + '}';
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
