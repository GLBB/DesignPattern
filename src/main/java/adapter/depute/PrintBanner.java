package adapter.depute;



public class PrintBanner implements Print {

    private Banner banner;

    public PrintBanner(String str) {
        this.banner = new Banner(str);
    }

    public void printWeak() {
        banner.showWithParen();
    }

    public void printStrong() {
        banner.showWithAster();
    }
}
