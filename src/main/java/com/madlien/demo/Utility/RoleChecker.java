package com.madlien.demo.Utility;

import lombok.experimental.UtilityClass;
import org.springframework.stereotype.Component;
@Component
@UtilityClass
public class RoleChecker {
private RoleChecker roleChecker;
    public  static boolean  canCreateMeetingRoom(String role) {
        return role.equals("administrator") || role.equals("manager");
    }
    public static boolean canDeleteAndReserveMeetingRoom(String role) {
        return role.equals("administrator") || role.equals("manager");
    }
    public static boolean canUpdateAndReserveMeetingRoom(String role) {
        return role.equals("administrator") || role.equals("manager");
    }

    public static boolean canReserveMeetingRoom(String role) {
        return canReserveMeetingRoom("administrator") || role.equals("developer") || role.equals("guest") || role.equals("cleaning stuff") || role.equals("maintenance stuff");
    }
    public static boolean canUpdateGadget(String role) {
        return role.equals("administrator") || role.equals("maitenance stuff");
    }

    public static boolean canDeleteGadget(String role) {
        return role.equals("administrator") || role.equals("maitenance stuff");
    }

    public static boolean canCreateGadget(String role) {
        return role.equals("administrator") || role.equals("maitenance stuff");
    }
}













 /*  private static String userRole;
    private static String action;

    public static boolean canUserApprove(String userRole, String action) {
        RoleChecker.userRole =userRole;
        RoleChecker.action = action;
        switch (userRole) {
            case "manager":
            case "admin":
                return true;
            case "developer":
            case "guest":
                return action.equalsIgnoreCase("reserve");
            case "cleaning staff":
                return action.equalsIgnoreCase("reserve");
            case "maintenance staff":
                return action.equalsIgnoreCase("reserve") || action.equalsIgnoreCase("update gadget") || action.equalsIgnoreCase("delete gadget");
            default:
                return false;
        }
    }*/
