public class NpeThief {
    private void callManyNPEInLoop() {
        for (int i = 0; i <= 1000000; i++) {
            try {
                ((Object)null).getClass();
            } catch (Exception e) {
                // This will switch from 2 to 0 (indicating our problem is happening)
                int length = e.getStackTrace().length;
                if (length == 0) {
                    System.out.println("i=" + i);
                    break;
                }
            }
        }
    }
    public static void main(String ... args) {
        NpeThief thief = new NpeThief();
        thief.callManyNPEInLoop();
    }
}
