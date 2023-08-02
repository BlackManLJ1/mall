package com.blackman.mall.product.exception;

import com.blackman.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestControllerAdvice(basePackages = "com.blackman.mall.product.controller")
public class MallException {

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R ArgumentNotValid(MethodArgumentNotValidException e) {
        Map<String, String> map = new HashMap<>();
        BindingResult bindingResult = e.getBindingResult();
        bindingResult.getFieldErrors().forEach(fieldError -> {
            String field = fieldError.getField();
            String message = fieldError.getDefaultMessage();
            map.put(field, message);
        });
        log.error("参数校验异常:{},类型为:{}", e.getMessage(), e.getClass());
        return R.error().put("data", map);
    }

    @ExceptionHandler(value = Throwable.class)
    public R throwableException(Throwable t) {
        log.error("发生了异常:{},类型为:{}", t.getMessage(), t.getClass());
        return R.error();
    }
}
