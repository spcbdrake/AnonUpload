package com.theironyard.services;

import com.theironyard.entities.AnonFile;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by benjamindrake on 11/18/15.
 */
public interface AnonFileRepository extends CrudRepository<AnonFile, Integer>{
}
