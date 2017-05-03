/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.livr.views.boundary;

import br.com.livr.BatedorDePenalti;
import br.com.livr.Equipe;
import br.com.livr.Goleiro;
import com.notification.NotificationFactory;
import com.notification.NotificationFactory.Location;
import com.notification.manager.SimpleManager;
import com.notification.types.IconNotification;
import com.platform.Platform;
import com.theme.ThemePackagePresets;
import com.utils.Time;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author victor
 */
public class Notificacao {

    private NotificationFactory factory = new NotificationFactory(ThemePackagePresets.cleanLight());
    private SimpleManager manager = new SimpleManager(Location.SOUTHEAST);
    private final int tempoDefaultDeDuracaoDaNotificacao = 5; //segundos
    private final String[] textosDefesa = new String[]{" nem pulou.", " pegou no cantiiinho."}, textosAtaque = new String[]{" deu um chute preciso.", " chutou no ângulo.", "deu uma cavadinha."};

    public Notificacao() {
        Platform.instance().setAdjustForPlatform(true);
        manager.setFadeEnabled(true);
        manager.setFadeTime(Time.seconds(tempoDefaultDeDuracaoDaNotificacao));
    }

    public void exibirNotificacao(BatedorDePenalti bp) {
        ImageIcon icon = new ImageIcon(InGameWindow.class.getResource("/br/com/livr/assets/soccer.png"));
        IconNotification iconNotification = this.getFactory().buildIconNotification("Goooooooool", bp.getNomeJogador() + getTextosAtaque()[new Random().nextInt(getTextosAtaque().length)], icon);
        iconNotification.setCloseOnClick(true);
        getManager().addNotification(iconNotification, Time.seconds(getTempoDefaultDeDuracaoDaNotificacao()));
    }

    public void exibirNotificacao(Goleiro g) {
        ImageIcon icon = new ImageIcon(InGameWindow.class.getResource("/br/com/livr/assets/goalkeeper.png"));
        IconNotification iconNotification = this.getFactory().buildIconNotification("Que defesa!", g.getNomeJogador() + getTextosDefesa()[new Random().nextInt(getTextosDefesa().length)], icon);
        iconNotification.setCloseOnClick(true);
        getManager().addNotification(iconNotification, Time.seconds(getTempoDefaultDeDuracaoDaNotificacao()));
    }

    public void exibirNotificacao(Equipe e, int golsPro, int golsContra) {
        ImageIcon icon = new ImageIcon(InGameWindow.class.getResource("/br/com/livr/assets/trophy.png"));
        IconNotification iconNotification = this.getFactory().buildIconNotification("É TETRA!!!", e.getNomeTime() + " venceu por " + golsPro + "x" + golsContra, icon);
        iconNotification.setCloseOnClick(true);
        getManager().addNotification(iconNotification, Time.infinite());
    }

    public NotificationFactory getFactory() {
        return factory;
    }

    public SimpleManager getManager() {
        return manager;
    }

    public void exibirNotificacao(String titulo, String texto, String icone, boolean fecharComClick, int tempoEmSegundos) {
        getManager().setLocation(Location.EAST);
        ImageIcon icon = new ImageIcon(InGameWindow.class.getResource("/br/com/livr/assets/" + icone));
        IconNotification iconNotification = getFactory().buildIconNotification(titulo, texto, icon);
        iconNotification.setCloseOnClick(fecharComClick);
        getManager().addNotification(iconNotification, Time.seconds(tempoEmSegundos));
    }

    public int getTempoDefaultDeDuracaoDaNotificacao() {
        return tempoDefaultDeDuracaoDaNotificacao;
    }

    public String[] getTextosDefesa() {
        return textosDefesa;
    }

    public String[] getTextosAtaque() {
        return textosAtaque;
    }
}
