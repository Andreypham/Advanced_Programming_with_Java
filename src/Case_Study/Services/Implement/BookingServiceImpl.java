package Case_Study.Services.Implement;

import Case_Study.Models.Booking.Booking;
import Case_Study.Models.Person.Customer;
import Case_Study.Services.IBookingService;
import Case_Study.Utils.Implement.BookingReadAndWriteFileCSV;
import Case_Study.Utils.Implement.CustomerReadAndWriteFileCSV;
import Case_Study.Views.DisplayMenu;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.TreeSet;

public class BookingServiceImpl implements IBookingService {
    private static TreeSet<Booking> bookingTreeSet = BookingReadAndWriteFileCSV.readFileCSV();

    private static List<Customer> customerList = CustomerReadAndWriteFileCSV.readFileCSV();

    @Override
    public void displayAll() {
        System.out.println("List of booking: ");
        for (Booking booking : bookingTreeSet) {
            System.out.println(booking);
        }
    }

    @Override
    public void addNewBooking() {
        boolean check = false;
        Booking newBooking = new Booking();
        Scanner scanner = new Scanner(System.in);
        CustomerServiceImpl.displayCustomerMainInfo();
        System.out.print("Select a customer's ID: ");
        String customerID = scanner.nextLine();
        for (Customer customer : customerList) {
            if (customer.getCustomerID().equals(customerID)) {
                check = true;
            }
        }
        if (check) {
            int choice;
            DisplayMenu.displaySubMenuFacility();
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    newBooking.setServiceType("Villa");
                    newBooking.setServiceName(setServiceNameByType("Villa"));
                    break;
                case 2:
                    newBooking.setServiceType("House");
                    newBooking.setServiceName(setServiceNameByType("House"));
                    break;
                case 3:
                    newBooking.setServiceType("Room");
                    newBooking.setServiceName(setServiceNameByType("Room"));
                    break;
                default:
                    System.err.println("Invalid choice!! Please try again!!");
                    break;
            }
            Scanner scanner1 = new Scanner(System.in);
            String startDate, endDate;
            do {
                System.out.print("Enter start date (dd-MM-yyyy): ");
                startDate = scanner1.nextLine();
                if (!validateDate(startDate)) {
                    System.err.println("Invalid start date!! Please try again!!!");
                }
            } while (!validateDate(startDate));
            do {
                System.out.print("Enter end date (dd-MM-yyyy): ");
                endDate = scanner1.nextLine();
                if (!validateDate(endDate)) {
                    System.err.println("Invalid end date!! Please try again!!");
                }
            } while (!validateDate(endDate));
            newBooking.setStartDate(startDate);
            newBooking.setEndDate(endDate);
            newBooking.setCustomerID(customerID);

            String bookingID = null;
            if (bookingTreeSet.size() < 9) {
                bookingID = "B00" + (bookingTreeSet.size() + 1);
            } else {
                bookingID = "B0" + (bookingTreeSet.size() + 1);
            }
            newBooking.setBookingID(bookingID);
            bookingTreeSet.add(newBooking);
            System.out.println("Successfully added new booking");
            System.out.println();

            BookingReadAndWriteFileCSV.writeFileCSV(bookingTreeSet);
        } else {
            System.err.println("Invalid customer's ID!! Please try again!!");
            System.out.println();
        }
    }

    @Override
    public boolean validateDate(String date) {
        LocalDateTime localDateTime;
        String pattern = "dd-MM-yyyy";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern, Locale.ENGLISH);
        try {
            localDateTime = LocalDateTime.parse(date, formatter);
            String result = localDateTime.format(formatter);
            return result.equals(date);
        } catch (DateTimeParseException e) {
            try {
                LocalDate localDate = LocalDate.parse(date, formatter);
                String result = localDate.format(formatter);
                return result.equals(date);
            } catch (DateTimeParseException exception) {
                try {
                    LocalTime localTime = LocalTime.parse(date, formatter);
                    String result = localTime.format(formatter);
                    return result.equals(date);
                } catch (DateTimeParseException ignored) {
                }
            }
        }
        return false;
    }

    public static String setServiceNameByType(String serviceType) {
        String serviceName = null;
        if (bookingTreeSet.size() < 9) {
            switch (serviceType) {
                case "Villa":
                    serviceName = "SVVL-000" + (bookingTreeSet.size() + 1);
                    break;
                case "House":
                    serviceName = "SVHO-000" + (bookingTreeSet.size() + 1);
                    break;
                case "Room":
                    serviceName = "SVRO-000" + (bookingTreeSet.size() + 1);
                    break;
            }
        } else {
            switch (serviceType) {
                case "Villa":
                    serviceName = "SVVL-00" + (bookingTreeSet.size() + 1);
                    break;
                case "House":
                    serviceName = "SVHO-00" + (bookingTreeSet.size() + 1);
                    break;
                case "Room":
                    serviceName = "SVRO-00" + (bookingTreeSet.size() + 1);
                    break;
            }
        }
        return serviceName;
    }
}
