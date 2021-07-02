package digital.innovation.one.utils;

import digital.innovation.one.utils.internal.DividiHelper;
import digital.innovation.one.utils.internal.MultiplicarHelper;
import digital.innovation.one.utils.internal.SomaHelper;
import digital.innovation.one.utils.internal.SubtrairHelper;

public class Calculadora {
    private SomaHelper somaHelper;
    private SubtrairHelper subtrairHelper;
    private DividiHelper dividiHelper;
    private MultiplicarHelper multiplicarHelper;

    public Calculadora() {
        somaHelper = new SomaHelper();
        subtrairHelper = new SubtrairHelper();
        dividiHelper = new DividiHelper();
        multiplicarHelper = new MultiplicarHelper();
    }

    public int somar(int a, int b){
        return  somaHelper.execute(a, b);
    }

    public int subtrair(int a, int b){
        return subtrairHelper.execute(a, b);
    }

    public int dividir(int a, int b){
        return dividiHelper.execute(a, b);
    }

    public int multiplicar(int a, int b){
        return multiplicarHelper.execute(a, b);
    }
}
