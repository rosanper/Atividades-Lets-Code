let delay = () => new Promise(resolve => setTimeout(resolve,Math.ceil(Math.random()*10000)))


async function criarArray(){

    await delay()
    

    let arrayResposta = []
    const arrayLength = Math.ceil(Math.random()*10)
    
    
    for(let i = 0; i<arrayLength;i++){
        let numero = Math.ceil(Math.random()*100)
        arrayResposta = [...arrayResposta, numero]
        
    }
    
    return arrayResposta
}

function criarLista(array){
    let lista = document.querySelector(".lista")
    let ul = document.createElement("ul")
    lista.appendChild(ul)
    let li = document.createElement("li")
    ul.appendChild(li)
    let novoArray=array.join()
    for(let item of novoArray){
        
        li.innerText += ` ${item} ` 
    } 
    
}

async function gerarListas(){

    const lista1 = criarArray()
    const lista2 = criarArray()
    const lista3 = criarArray()

    Promise.all([lista1, lista2, lista3]).then((values) => {

        // for(let element of values){        "tinha entedido que era para mostrar cada um dos três arrays, depois entendi
        //     criarLista(element)       ==>     que era para mostrar só o array resultado. Caso seja para mostrar cada
        // }                                          um dos três arrays é so utilizar ese código que esta comentado"
        criarLista(values)
        console.log(values);
    });
    
    console.log(lista1)
    console.log(lista2)
    console.log(lista3)


}

function zerarListas(){
    console.log("funciona")
    let elementos = document.querySelectorAll("ul")
    console.log(elementos)
    for(let element of elementos){
        element.remove()
    }
        
}
