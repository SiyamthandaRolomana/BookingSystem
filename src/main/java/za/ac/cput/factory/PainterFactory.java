package za.ac.cput.factory;

import za.ac.cput.domain.Painter;
import za.ac.cput.util.Helper;

import javax.swing.*;


public class PainterFactory {
    public static Painter createPainter(String painterID, String name, String email, String phoneNumber, String role) {
        if (Helper.isNullorEmpty(painterID) || Helper.isNullorEmpty(name) || Helper.isNullorEmpty(phoneNumber)
                || Helper.isNullorEmpty(email))
            return null;

        return new Painter.Builder()
                .setPainterID(painterID)
                .setName(name)
                .setPhoneNumber(phoneNumber)
                .setEmail(email)
                .setRole(role)
                .build();
}

}