package br.com.erudio.controllers;

import br.com.erudio.exceptions.UnsupportedMathOperationException;
import br.com.erudio.utils.MathUtils;
import br.com.erudio.utils.SimpleMath;
import org.springframework.web.bind.annotation.*;

@RestController
public class MathController {

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(@PathVariable(value = "numberOne") String numberOne,
                      @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        if (!MathUtils.isNumeric(numberOne) || !MathUtils.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }
        return SimpleMath.sum(MathUtils.convertToDouble(numberOne), MathUtils.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sub(@PathVariable(value = "numberOne") String numberOne,
                      @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        if (!MathUtils.isNumeric(numberOne) || !MathUtils.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }
        return SimpleMath.sub(MathUtils.convertToDouble(numberOne), MathUtils.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "mult/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double mult(@PathVariable(value = "numberOne") String numberOne,
                      @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        if (!MathUtils.isNumeric(numberOne) || !MathUtils.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }
        return SimpleMath.mult(MathUtils.convertToDouble(numberOne), MathUtils.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "div/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double div(@PathVariable(value = "numberOne") String numberOne,
                       @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        if (!MathUtils.isNumeric(numberOne) || !MathUtils.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }
        return SimpleMath.div(MathUtils.convertToDouble(numberOne), MathUtils.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "med/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double med(@PathVariable(value = "numberOne") String numberOne,
                      @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        if (!MathUtils.isNumeric(numberOne) || !MathUtils.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }
        return SimpleMath.med(MathUtils.convertToDouble(numberOne), MathUtils.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "sqrt/{number}", method = RequestMethod.GET)
    public Double sqrt(@PathVariable(value = "number") String number
    ) throws Exception {
        if (!MathUtils.isNumeric(number)) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }
        return SimpleMath.sqrt(MathUtils.convertToDouble(number));
    }
}
