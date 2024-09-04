package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.*;

public class Test {
    public static void main(String[] args) {
        //Testes relacionados ao Design Pattern Singleton
        SingletonLazy sz = SingletonLazy.getInstance();
        System.out.println(sz);
        System.out.println("=========================");
        SingletonLazy sz1 = SingletonLazy.getInstance();
        System.out.println(sz1);

        System.out.println("---------------------------------");
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        System.out.println("=========================");
        SingletonEager eager1 = SingletonEager.getInstancia();
        System.out.println(eager1);

        System.out.println("---------------------------------");
        SingletonLazyHolder lz = SingletonLazyHolder.getInstance();
        System.out.println(lz);
        System.out.println("=========================");
        SingletonEager lz1 = SingletonEager.getInstancia();
        System.out.println(lz1);

        //Testes relacionados ao Design Pattern Strategy
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento normal = new ComportamentoNormal();

        var robo = new Robo();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        System.out.println("=========================");
        System.out.println();
        System.out.println("----------------------------");
        //Testes relacionados ao Design Pattern Facade
        Facade facade = new Facade();
        facade.migrarCliente("EUfrasio", "123456789");
    }
}
