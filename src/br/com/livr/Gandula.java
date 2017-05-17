package br.com.livr;

import br.com.livr.views.boundary.Notificacao;
import com.notification.NotificationFactory;
public class Gandula {
    public void posicionarBolaNaMarcaDoPenalti() {
        new Notificacao().exibirNotificacao("Gandula", "Bola posicionada na marca!", "soccer.png", true, 3, NotificationFactory.Location.SOUTH);
    }
}
