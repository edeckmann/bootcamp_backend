package com.bootcamp.project.Exceptions;

import com.bootcamp.project.Utils.MessageUtils;

public class NotFoundException extends RuntimeException {
    public NotFoundException() {
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}
