package Demo1.service;

import Demo1.service.IService;

import java.io.IOException;

public interface IStudentService extends IService {
    void sortByName() throws IOException;
}
