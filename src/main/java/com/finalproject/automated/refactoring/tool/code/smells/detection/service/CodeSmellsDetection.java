package com.finalproject.automated.refactoring.tool.code.smells.detection.service;

import com.finalproject.automated.refactoring.tool.model.ClassModel;
import com.finalproject.automated.refactoring.tool.model.MethodModel;
import lombok.NonNull;

import java.util.List;

/**
 * @author M. Reza Pahlevi
 * @version 1.0.0
 * @since 29 April 2019
 */

public interface CodeSmellsDetection {

    void detect(@NonNull MethodModel methodModel);

    void detectClass(@NonNull ClassModel classModel);

    void detect(@NonNull List<MethodModel> methodModels);

    void detectClass(@NonNull List<ClassModel> classModels);
}
