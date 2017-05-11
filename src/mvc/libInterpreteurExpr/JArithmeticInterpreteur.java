package mvc.libInterpreteurExpr;

public class JArithmeticInterpreteur {

    static Node toto;

    public static void main(String args[]) {
        StringBuffer input;
        StringBuffer output;

        //input=new StringBuffer("cos(x)^2+sin(x)^2");

        input = new StringBuffer("(x+y)*x");
        output = new StringBuffer(255);

        toto = Node.Construct_Tree(input, input.length(), 0);
        toto.Write_Tree(output);
        System.out.println(output);

        //System.out.println(toto.Compute_Tree(3,4,0));
        System.out.println(toto.Compute_Tree(3, 1, 0));
    }
}
