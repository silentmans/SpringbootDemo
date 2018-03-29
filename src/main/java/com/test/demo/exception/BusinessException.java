package com.test.demo.exception;

import java.io.Serializable;

public class BusinessException extends RuntimeException implements Serializable{

	private static final long serialVersionUID = 7827057930678133300L;

	public BusinessException(Object Obj) {
        super(Obj.toString());
    }

}
