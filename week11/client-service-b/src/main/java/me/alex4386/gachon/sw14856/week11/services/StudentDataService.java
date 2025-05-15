package me.alex4386.gachon.sw14856.week11.services;

import me.alex4386.gachon.sw14856.week11.config.StudentConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class StudentDataService {

    private static final Logger logger = LoggerFactory.getLogger(StudentDataService.class);

    @Autowired
    private StudentConfig studentConfig;

    public void print() {
        List<Map<String, String>> studentData = studentConfig.getData();

        // first check if studentData is null
        if (studentConfig.getData() == null) {
            logger.error("studentData is null");
            return;
        }

        // print the studentData
        for (Map<String, String> student : studentData) {
            StringBuilder builder = new StringBuilder("Student: ");

            String name = student.get("name");
            String id = student.get("id");

            if (name == null) continue;
            if (id != null) {
                builder.append("#"+student.get("id"));
                builder.append(" ");
            }

            builder.append(name);
            logger.info(builder.toString());
        }
    }
}
