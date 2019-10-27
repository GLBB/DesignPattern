package mediator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends Frame implements ActionListener, Mediator {
    private ColleagueCheckbox checkGuest;
    private ColleagueCheckbox ckeckLogin;
    private ColleagueTextField textUser;
    private ColleagueTextField textPass;
    private ColleagueButton buttonOk;
    private ColleagueButton buttonCancel;

    public LoginFrame(String title) {
        super(title);
        setBackground(Color.lightGray);
        setLayout(new GridLayout(4, 2));
        createcolleagures();
        add(checkGuest);
        add(ckeckLogin);
        add(new Label("Username:"));
        add(textUser);
        add(new Label("Password:"));
        add(textPass);
        add(buttonOk);
        add(buttonCancel);
        colleagureChanged();
        pack();
        show();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void createcolleagures() {
        CheckboxGroup g = new CheckboxGroup();

    }

    @Override
    public void colleagureChanged() {

    }
}
