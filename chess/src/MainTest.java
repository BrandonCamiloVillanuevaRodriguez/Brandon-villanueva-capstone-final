import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
// testeando algoritmo Selection sort
    @Test
    public void Test1() throws InterruptedException {
        String[] Valores = new String[6];
        Valores[0] ="a=s";
        Valores[1] ="T=c";
        Valores[2] ="o=b";
        Valores[3] ="In=r";
        Valores[4] ="r=16";
        Valores[5] ="s=140";
        Main mainTest = new Main();
        mainTest.main(Valores);
    }

    @Test
    public void Test2() throws InterruptedException {
        String[] Valores = new String[6];
        Valores[0] ="a=m";
        Valores[1] ="T=N";
        Valores[2] ="o=b";
        Valores[3] ="In=r";
        Valores[4] ="r=16";
        Valores[5] ="s=900";
        Main mainTest = new Main();
        mainTest.main(Valores);
    }

    @Test
    public void Test3() throws InterruptedException {
        String[] Valores = new String[6];
        Valores[0] ="a=p";
        Valores[1] ="T=c";
        Valores[2] ="o=b";
        Valores[3] ="In=r";
        Valores[4] ="r=6";
        Valores[5] ="s=900";
        Main mainTest = new Main();
        mainTest.main(Valores);
    }

    @Test
    public void Test4() throws InterruptedException {
        String[] Valores = new String[6];
        Valores[0] ="a=s";
        Valores[1] ="T=N";
        Valores[2] ="o=b";
        Valores[3] ="In=r";
        Valores[4] ="r=0";
        Valores[5] ="s=900";
        Main mainTest = new Main();
        mainTest.main(Valores);
    }
    // testeando algoritmo Buble sort
    @Test
    public void Test5() throws InterruptedException {
        String[] Valores = new String[6];
        Valores[0] ="a=b";
        Valores[1] ="T=c";
        Valores[2] ="o=b";
        Valores[3] ="In=r";
        Valores[4] ="r=16";
        Valores[5] ="s=140";
        Main mainTest = new Main();
        mainTest.main(Valores);
    }

    @Test
    public void Test6() throws InterruptedException {
        String[] Valores = new String[6];
        Valores[0] ="a=b";
        Valores[1] ="T=N";
        Valores[2] ="o=b";
        Valores[3] ="In=r";
        Valores[4] ="r=16";
        Valores[5] ="s=900";
        Main mainTest = new Main();
        mainTest.main(Valores);
    }

    @Test
    public void Test7() throws InterruptedException {
        String[] Valores = new String[6];
        Valores[0] ="a=b";
        Valores[1] ="T=c";
        Valores[2] ="o=b";
        Valores[3] ="In=r";
        Valores[4] ="r=1";
        Valores[5] ="s=900";
        Main mainTest = new Main();
        mainTest.main(Valores);
    }

    @Test
    public void Test8() throws InterruptedException {
        String[] Valores = new String[6];
        Valores[0] ="a=b";
        Valores[1] ="T=N";
        Valores[2] ="o=b";
        Valores[3] ="In=r";
        Valores[4] ="r=0";
        Valores[5] ="s=900";
        Main mainTest = new Main();
        mainTest.main(Valores);
    }
    // testeando Insertion sort
    @Test
    public void Test9() throws InterruptedException {
        String[] Valores = new String[6];
        Valores[0] ="a=i";
        Valores[1] ="T=c";
        Valores[2] ="o=b";
        Valores[3] ="In=r";
        Valores[4] ="r=16";
        Valores[5] ="s=140";
        Main mainTest = new Main();
        mainTest.main(Valores);
    }

    @Test
    public void Test10() throws InterruptedException {
        String[] Valores = new String[6];
        Valores[0] ="a=i";
        Valores[1] ="T=N";
        Valores[2] ="o=b";
        Valores[3] ="In=r";
        Valores[4] ="r=16";
        Valores[5] ="s=900";
        Main mainTest = new Main();
        mainTest.main(Valores);
    }

    @Test
    public void Test11() throws InterruptedException {
        String[] Valores = new String[6];
        Valores[0] ="a=i";
        Valores[1] ="T=n";
        Valores[2] ="o=b";
        Valores[3] ="In=r";
        Valores[4] ="r=3";
        Valores[5] ="s=900";
        Main mainTest = new Main();
        mainTest.main(Valores);
    }

    @Test
    public void Test12() throws InterruptedException {
        String[] Valores = new String[6];
        Valores[0] ="a=i";
        Valores[1] ="T=N";
        Valores[2] ="o=b";
        Valores[3] ="In=r";
        Valores[4] ="r=0";
        Valores[5] ="s=900";
        Main mainTest = new Main();
        mainTest.main(Valores);
    }
    // testeando algoritmo Quick sort
    @Test
    public void Test13() throws InterruptedException {
        String[] Valores = new String[6];
        Valores[0] ="a=q";
        Valores[1] ="T=c";
        Valores[2] ="o=b";
        Valores[3] ="In=r";
        Valores[4] ="r=16";
        Valores[5] ="s=140";
        Main mainTest = new Main();
        mainTest.main(Valores);
    }

    @Test
    public void Test14() throws InterruptedException {
        String[] Valores = new String[6];
        Valores[0] ="a=q";
        Valores[1] ="T=N";
        Valores[2] ="o=b";
        Valores[3] ="In=r";
        Valores[4] ="r=16";
        Valores[5] ="s=900";
        Main mainTest = new Main();
        mainTest.main(Valores);
    }

    @Test
    public void Test15() throws InterruptedException {
        String[] Valores = new String[6];
        Valores[0] ="a=q";
        Valores[1] ="T=n";
        Valores[2] ="o=b";
        Valores[3] ="In=r";
        Valores[4] ="r=6";
        Valores[5] ="s=900";
        Main mainTest = new Main();
        mainTest.main(Valores);
    }

    @Test
    public void Test16() throws InterruptedException {
        String[] Valores = new String[6];
        Valores[0] ="a=q";
        Valores[1] ="T=N";
        Valores[2] ="o=b";
        Valores[3] ="In=r";
        Valores[4] ="r=0";
        Valores[5] ="s=900";
        Main mainTest = new Main();
        mainTest.main(Valores);
    }
    // pruebas de calidad finales

    @Test
    public void Test17() throws InterruptedException {
        String[] Valores = new String[6];
        Valores[0] ="a=";
        Valores[1] ="T=N";
        Valores[2] ="o=b";
        Valores[3] ="In=r";
        Valores[4] ="r=0";
        Valores[5] ="s=900";
        Main mainTest = new Main();
        mainTest.main(Valores);
    }

    @Test
    public void Test18() throws InterruptedException {
        String[] Valores = new String[6];
        Valores[0] ="a=s";
        Valores[1] ="T=N";
        Valores[2] ="o=b";
        Valores[3] ="In=r";
        Valores[4] ="r=0";
        Valores[5] ="s=900";
        Main mainTest = new Main();
        mainTest.main(Valores);
    }


    @Test
    public void Test19() throws InterruptedException {
        String[] Valores = new String[6];
        Valores[0] ="a=s";
        Valores[1] ="T=N";
        Valores[2] ="o=b";
        Valores[3] ="In=r";
        Valores[4] ="r=0";
        Valores[5] ="s=0";
        Main mainTest = new Main();
        mainTest.main(Valores);
    }

    @Test
    public void Test20() throws InterruptedException {
        String[] Valores = new String[6];
        Valores[0] ="a=";
        Valores[1] ="T=";
        Valores[2] ="o=";
        Valores[3] ="In=";
        Valores[4] ="r=";
        Valores[5] ="s=";
        Main mainTest = new Main();
        mainTest.main(Valores);
    }

    @Test
    public void Test21() throws InterruptedException {
        String[] Valores = new String[6];
        Valores[0] ="=s";
        Valores[1] ="=N";
        Valores[2] ="=b";
        Valores[3] ="n=r";
        Valores[4] ="=0";
        Valores[5] ="=900";
        Main mainTest = new Main();
        mainTest.main(Valores);
    }

    @Test
    public void Test22() throws InterruptedException {
        String[] Valores = new String[4];
        Valores[0] ="a=s";
        Valores[1] ="T=N";
        Valores[2] ="o=b";
        Valores[3] ="In=r";
        Main mainTest = new Main();
        mainTest.main(Valores);
    }
}