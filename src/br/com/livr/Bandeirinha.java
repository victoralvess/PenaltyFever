package br.com.livr;

import br.com.livr.statics.Arbitro;
import br.com.livr.views.boundary.Notificacao;
import com.notification.NotificationFactory;

public class Bandeirinha extends Arbitro {

    boolean irregularidade;

    public Bandeirinha(int nivelHonestidade) {
        super.setNivelHonestidade(nivelHonestidade);
    }

    public boolean verificarIrregularidadeAoJuiz() {
        return roubar(getNivelHonestidade(), true);
    }
    
    public void comunicarIrregularidadeAoJuiz() {
        new Notificacao().exibirNotificacao("Bandeirinha", "É pra Cartão!", "flag.png", true, 4, NotificationFactory.Location.NORTHEAST);
    }

}
