package br.com.livr.statics;

import br.com.livr.views.boundary.Notificacao;
import com.notification.NotificationFactory;
import java.util.Random;

public abstract class Arbitro {
    
    private int nivelHonestidade;

    public int getNivelHonestidade() {
        return nivelHonestidade;
    }

    public void setNivelHonestidade(int aNivelHonestidade) {
        nivelHonestidade = aNivelHonestidade;
    }

    public boolean roubar(int nivelHonestidade, boolean decisaoCerta) {
        Random r = new Random();
        int valor = r.nextInt(101);

        if (valor < 90 && nivelHonestidade >= 50) {
            return decisaoCerta;
        }
        return !decisaoCerta;
    }

    public void explicarRegras() {
        new Notificacao().exibirNotificacao("Regras", "Vale quase tudo!", "angry.png", true, 5, NotificationFactory.Location.NORTHWEST);
    }
}
