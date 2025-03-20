package me.alex4386.gachon.sw14856.week03.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class GradeData {
    public String id = null;
    public String name;

    /**
     * Due to requested convention from the professor,
     * I need to use "korean-romanization" for the variable name.
     * See eGovFrame Naming Convention for more information.
     */
    public double kuk;
    public double eng;
    public double math;

    @JsonIgnore
    public List<Double> getGrade() {
        List<Double> grades = new ArrayList<>();

        Field[] availableFields = this.getClass().getDeclaredFields();
        for (Field field : availableFields) {
            if (field.getType().equals(Double.TYPE)) {
                // This seems like a valid grade.
                try {
                    grades.add(field.getDouble(this));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        return grades;
    }

    @JsonIgnore
    public double getTotal() {
        return this.getGrade().stream().reduce(0.0, Double::sum);
    }

    @JsonIgnore
    public double getAverage() {
        if (this.getGrade().size() == 0) return 0;
        return this.getTotal() / this.getGrade().size();
    }

    @JsonIgnore
    public void transferData(GradeData data) {
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            try {
                field.set(this, field.get(data));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
