package homework2.PersonPet;

public class Email {
    String mailSite;
    String login;
    String password;

    @Override
    public String toString() {
        return "Email{" +
                "mailSite='" + mailSite + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getMailSite() {
        return mailSite;
    }

    public void setMailSite(String mailSite) {
        this.mailSite = mailSite;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Email() {
    }

    public Email(String mailSite, String login, String password) {
        this.mailSite = mailSite;
        this.login = login;
        this.password = password;
        System.out.println("You successful logged!");
    }
}
