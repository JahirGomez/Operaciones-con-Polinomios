package Model;

import org.scilab.forge.jlatexmath.ParseException;
import org.scilab.forge.jlatexmath.TeXConstants;
import org.scilab.forge.jlatexmath.TeXFormula;
import org.scilab.forge.jlatexmath.TeXIcon;
public class LaTex {
    
    //Representa una fórmula matemática lógica que se mostrará en un TexIcon
    TeXFormula formula;
    //Una implementación de Icon que pintará la formula que la creó.
    TeXIcon icon;
    String math;
    
    public LaTex(){
        // ...
    }

    public LaTex(String math){    
        this.math = math;
    }
    
    public TeXIcon getIconLaTex(){        
        try {
            formula = new TeXFormula(this.math);
            this.icon = this.formula.createTeXIcon(TeXConstants.ALIGN_CENTER, 40);
            return this.icon;
        } catch (ParseException e) {
            System.err.println("Error: "+ e.getMessage());
            return this.icon = null;
        }                         
    }
    
    public TeXIcon actualizarIconLaTex(String math, int valor){        
        try {
            this.math = math;            
            this.formula = new TeXFormula(this.math);
            this.icon = this.formula.new TeXIconBuilder().setStyle(TeXConstants.STYLE_DISPLAY)
                    .setSize(valor)
                    .setWidth(TeXConstants.UNIT_PIXEL, 256f, TeXConstants.ALIGN_LEFT)
                    .setIsMaxWidth(true)
                    .setInterLineSpacing(TeXConstants.UNIT_PIXEL, 20f).build();
            return this.icon;           
                        
        } catch (ParseException e) {
            System.err.println("Error: "+ e.getMessage());
            return this.icon = null;
        }
    
    }
    
    
    
}
