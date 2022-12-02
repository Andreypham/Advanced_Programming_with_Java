package Case_Study.Services;

public interface IBookingService extends IService {
    void addNewBooking();
    boolean validateDate(String date);
}
