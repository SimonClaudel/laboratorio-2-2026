package ar.edu.unlu.poo.labo2.estrategias;

import ar.edu.unlu.poo.labo2.artefactos.Artefacto;

import java.util.List;

public class EstrategiaCompuesta implements EstrategiaDeMejora {
    List<EstrategiaDeMejora> estrategias;
    public EstrategiaCompuesta(EstrategiaDeMejora... estrategias) {
        this.estrategias = List.of(estrategias);
    }

    @Override
    public void mejorar(Artefacto artefacto) {
        for(EstrategiaDeMejora e : estrategias) {
            e.mejorar(artefacto);
        }
    }
}
