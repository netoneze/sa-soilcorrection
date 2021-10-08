package edu.utfpr.cp.dacom.sa.soilcorrection.correcoes.fontes;

import edu.utfpr.cp.dacom.sa.soilcorrection.nutriente.NutrienteAdicional;
import java.util.Set;

public interface IFonteNutriente {
    
    public double getTeorFonte();
    public Set<NutrienteAdicional> getNutrientesAdicionais();
}
