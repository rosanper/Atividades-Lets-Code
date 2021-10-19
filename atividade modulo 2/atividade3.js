// modulo calculadora - primeira resolução

let moduloCalculadora = (() => {

    const _numerosParaOperar = []
    const _operadorParaCalculo = []

    const entradasSalvas = new Map()

    const _entradaNumero = num => {
        if(isNaN(num)){
            return "você deve entrar com um número"
        }
        return _numerosParaOperar.push(num) 
    }

    const _entradaOperador = operador => {
        switch (operador){
            case "+" :
                return _operadorParaCalculo.push("+");
                break;
            case "-" :
                return _operadorParaCalculo.push("-");
                break;
            case "*":
                return _operadorParaCalculo.push("*");
                break;
            case "/":
                return _operadorParaCalculo.push("/");
                break;
            default:
                return 'você deve digitar um operador: "+" , "-", "*", "/" .'    
        } 
    }

    const enter = dado => {
        if(typeof dado === "number"){
            return _entradaNumero(dado)
        } else if( typeof dado === "string"){
            return _entradaOperador(dado)
        } else {
            return "Entre com um numero ou um operador"
        }
    }

    const _zerarArray = array => {
        while(array.length!==0){
            array.pop();
        }
    }

    const equals = () => {
        const n1 = _numerosParaOperar[0]
        const n2 = _numerosParaOperar[1] 
        const op = _operadorParaCalculo[0]

        let resultado = 0
        if (op == "+"){
            resultado = n1 + n2;
        } else if (op == "-"){
            resultado = n1 - n2;
        }else if (op == "*"){
            resultado = n1 * n2;
        } else{
            resultado = n1 / n2;
        }

        entradasSalvas.set(`${n1} ${op} ${n2}`, resultado)
        _zerarArray(_numerosParaOperar)
        _zerarArray(_operadorParaCalculo)

        return resultado
    }

    const reset = () => {
        entradasSalvas.clear()
    }

    const list = () => {
        return entradasSalvas
    }

    return {
        enter,
        equals,
        list,
        reset
    }

})()

// modulo calculadora - modificada

const somar = (n1,n2) => n1 + n2;
const subtrair = (n1,n2) => n1 - n2;
const multiplicar = (n1,n2) => n1 * n2;
const dividir = (n1,n2) => parseFloat((n1 / n2).toFixed(3));

let moduloCalculadora = (() => {

    let _numerosParaOperar = []
    let _operadorParaCalculo = []

    const entradasSalvas = new Map()

    const _entradaNumero = num => {
        if (_numerosParaOperar.length > 1){
            return "Você já adicionou os números a serem operados, agora digite o operador"
        }
        return _numerosParaOperar = [..._numerosParaOperar, num] 
    }

    const operadoresPossiveis = {
        "+": somar,
        "-": subtrair,
        "*": multiplicar,
        "/": dividir
    }

    const _entradaOperador = operador => {
        if (_operadorParaCalculo.length !== 0){
            return "Você já adicionou o operador, agora digite o número a ser operado"
        }
        if(operadoresPossiveis[operador]){
            return _operadorParaCalculo = [..._operadorParaCalculo, operador];
        }
        return 'Você deve digitar um operador: "+" , "-", "*", "/" '
    }

    const enter = dado => {
        if (_operadorParaCalculo.length !== 0 && _numerosParaOperar.length > 1){
            return "Você já digitou todos os dados, veja o resultado da operação"
        }
        if(typeof dado === "number"){
            return _entradaNumero(dado)
        }
        if( typeof dado === "string"){
            return _entradaOperador(dado)
        }
        return "Entre com um numero ou um operador"
        
    }

    const _zerarArray = array => {
        while(array.length!==0){
            array.pop();
        }
    }

    const equals = () => {
        const [n1,n2] = _numerosParaOperar
        const [op] = _operadorParaCalculo

        const resultado = operadoresPossiveis[op](n1,n2)

        entradasSalvas.set(`${n1} ${op} ${n2}`, resultado)
        _zerarArray(_numerosParaOperar)
        _zerarArray(_operadorParaCalculo)

        return resultado
    }

    const reset = () => {
        entradasSalvas.clear()
        return entradasSalvas
    }

    const list = () => {
        return entradasSalvas
    }

    return {
        enter,
        equals,
        list,
        reset
    }

})()

