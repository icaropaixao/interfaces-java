package interfaces.herancas.abstrata.model.entities;
import interfaces.herancas.abstrata.model.enums.Color;

// Classe abstrata AbstractShape que implementa a interface Shape
// Ela serve como uma base para outras formas geométricas que compartilharão características comuns
public abstract class AbstractShape implements Shape {

    private Color color;

    // Construtor que inicializa a cor da forma
    public AbstractShape(Color color) {
        this.color = color;
    }

    // Método getter que retorna a cor da forma
    public Color getColor() {
        return color;
    }

    // Método setter que permite alterar a cor da forma
    public void setColor(Color color) {
        this.color = color;
    }
}
