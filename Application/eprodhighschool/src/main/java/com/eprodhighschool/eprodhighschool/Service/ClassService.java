package com.eprodhighschool.eprodhighschool.Service;

import com.eprodhighschool.eprodhighschool.Repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService {

    @Autowired
    ClassRepository classRepository;


    public List<Class> viewClassStreams(){

        return classRepository.findAll();
    }
    /// use id to find a single class stream
    public Class viewSingleClass(Long id){

        return classRepository.findById(id).get();
    }
}
