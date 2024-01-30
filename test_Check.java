import java.util.*; // fail AvoidStarImport rule

public class test_Check { // should fail the TypeName rule

    public void BADMethodName() { // should fail the MethodName rule
        int num = 0;
        if (num == 0) // should fail the NeedBraces rule
            System.out.println("Number is zero");
    }
}
