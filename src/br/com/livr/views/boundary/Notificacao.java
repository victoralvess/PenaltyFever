package br.com.livr.views.boundary;

import br.com.livr.BatedorDePenaltis;
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

public class Notificacao {

    private NotificationFactory notificationFactory = new NotificationFactory(ThemePackagePresets.cleanLight());
    private SimpleManager simpleManager = new SimpleManager(Location.SOUTHEAST);
    private final int tempoDefaultDeDuracaoDaNotificacao = 5; //em segundos
    private final String[] mensagensDefesa = new String[]{" nem pulou.", " pegou no cantiiinho."}, mensagensAtaque = new String[]{" deu um chute preciso.", " chutou no ângulo.", " deu uma cavadinha."};

    public Notificacao() {
        Platform.instance().setAdjustForPlatform(true);
        simpleManager.setFadeEnabled(true);
        simpleManager.setFadeTime(Time.seconds(tempoDefaultDeDuracaoDaNotificacao));
    }

    public void exibirNotificacao(BatedorDePenaltis bp) {
        getSimpleManager().setLocation(Location.NORTH);
        ImageIcon icon = new ImageIcon(InGameWindow.class.getResource("/br/com/livr/assets/soccer.png"));
        IconNotification iconNotification = this.getNotificationFactory().buildIconNotification("Goooooooool", bp.getNomeJogador() + getMensagensAtaque()[new Random().nextInt(getMensagensAtaque().length)], icon);
        iconNotification.setCloseOnClick(true);
        getSimpleManager().addNotification(iconNotification, Time.seconds(getTempoDefaultDeDuracaoDaNotificacao()));
        getSimpleManager().setLocation(Location.SOUTHEAST);//RESET TO DEFAULT
    }

    public void exibirNotificacao(Goleiro g) {
        ImageIcon icon = new ImageIcon(InGameWindow.class.getResource("/br/com/livr/assets/goalkeeper.png"));
        IconNotification iconNotification = this.getNotificationFactory().buildIconNotification("Que defesa!", g.getNomeJogador() + getMensagensDefesa()[new Random().nextInt(getMensagensDefesa().length)], icon);
        iconNotification.setCloseOnClick(true);
        getSimpleManager().addNotification(iconNotification, Time.seconds(getTempoDefaultDeDuracaoDaNotificacao()));
    }

    public void exibirNotificacao(Equipe e, int golsPro, int golsContra) {
        ImageIcon icon = new ImageIcon(InGameWindow.class.getResource("/br/com/livr/assets/trophy.png"));
        IconNotification iconNotification = this.getNotificationFactory().buildIconNotification("É TETRA!!!", e.getNomeEquipe() + " venceu por " + golsPro + "x" + golsContra, icon);
        iconNotification.setCloseOnClick(true);
        getSimpleManager().addNotification(iconNotification, Time.infinite());
    }

    public NotificationFactory getNotificationFactory() {
        return notificationFactory;
    }

    public SimpleManager getSimpleManager() {
        return simpleManager;
    }

    public void exibirNotificacao(String titulo, String texto, String icone, boolean fecharComClick, int duracaoEmSegundos, Location posicao) {
        getSimpleManager().setLocation(posicao);
        ImageIcon icon = new ImageIcon(InGameWindow.class.getResource("/br/com/livr/assets/" + icone));
        IconNotification iconNotification = getNotificationFactory().buildIconNotification(titulo, texto, icon);
        iconNotification.setCloseOnClick(fecharComClick);
        getSimpleManager().addNotification(iconNotification, Time.seconds(duracaoEmSegundos));
    }

    public int getTempoDefaultDeDuracaoDaNotificacao() {
        return tempoDefaultDeDuracaoDaNotificacao;
    }

    public String[] getMensagensDefesa() {
        return mensagensDefesa;
    }

    public String[] getMensagensAtaque() {
        return mensagensAtaque;
    }
}
