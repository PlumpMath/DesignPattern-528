package state;

/**
 *
 * @author kinopp
 */
public class DayState implements State {
    private static DayState singleton = new DayState();
    private DayState() {                                // �R���X�g���N�^��private
    }

    /**
     *
     * @return
     */
    public static State getInstance() {                 // �B��̃C���X�^���X�𓾂�
        return singleton;
    }

    /**
     *
     * @param context
     * @param hour
     */
    public void doClock(Context context, int hour) {    // �����ݒ�
        if (hour < 9 || 17 <= hour) {
            context.changeState(NightState.getInstance());
        }
    }

    /**
     *
     * @param context
     */
    public void doUse(Context context) {                // ���Ɏg�p
        context.recordLog("���Ɏg�p(����)");
    }

    /**
     *
     * @param context
     */
    public void doAlarm(Context context) {              // ���x��
        context.callSecurityCenter("���x��(����)");
    }

    /**
     *
     * @param context
     */
    public void doPhone(Context context) {              // �ʏ�ʘb
        context.callSecurityCenter("�ʏ�̒ʘb(����)");
    }
    public String toString() {                          // ������\��
        return "[����]";
    }
}
