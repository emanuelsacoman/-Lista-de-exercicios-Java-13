class ExceptionA extends Exception {
    @Override
    public String toString() {
        return "ExceptionA: Ocorreu uma exceção da classe ExceptionA.";
    }
}

class ExceptionB extends ExceptionA {
    @Override
    public String toString() {
        return "ExceptionB: Ocorreu uma exceção da classe ExceptionB, que herda de ExceptionA.";
    }
}

class ExceptionC extends ExceptionB {
    @Override
    public String toString() {
        return "ExceptionC: Ocorreu uma exceção da classe ExceptionC, que herda de ExceptionB.";
    }
}

public class ExemploHerancaExcecao {
    public static void main(String[] args) {
        try {
            throw new ExceptionB();
        } catch (ExceptionA exception) {
            System.out.println(exception);
        }
    }
}