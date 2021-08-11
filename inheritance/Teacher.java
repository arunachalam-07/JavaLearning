import java.lang.*;

class Teachers
{
    Teachers()
    {
        System.out.println("Base_class->I am a teacher");
    }
    void Assignments()
    {
        System.out.println("Base_class->I can give assignments");
    }
}

class PhysicsTeacher extends Teachers
{
    PhysicsTeacher()
    {
        System.out.println("child_class->I can Teach Physics");
    }

    void Assignments()
    {
        System.out.println("child_class->Physics Assignment");
    }
}

class MathsTeacher extends Teachers
{
    void Assignments()
        {
            super.Assignments();
            System.out.println("child_class->Maths Assignment");
        }
}


class MotivationalTeacher extends Teachers{}

class Teacher
{
    public static void main(String[] args) {
        System.out.println("Teacher");
        Teachers t=new Teachers();
        t.Assignments();
        System.out.println();
        System.out.println("Physics Teacher");
        PhysicsTeacher p=new PhysicsTeacher();
        p.Assignments();
        System.out.println();
        System.out.println("Maths Teacher");
        MathsTeacher m=new MathsTeacher();
        m.Assignments();
        System.out.println();
        System.out.println("MotivationalTeacher");
        MotivationalTeacher mot=new MotivationalTeacher();
        mot.Assignments();
    }
}