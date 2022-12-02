package Demo1.service;

import java.io.IOException;

public interface IService {
    void display() throws IOException;
    void addNew() throws IOException;
    void update() throws IOException;
    void delete() throws IOException;
}
