let form = document.querySelector('form')
let lista = document.querySelector('.respostas')
let input = document.querySelector('.formulario input')
input.focus()

const adicionarItem = evt =>{
    evt.preventDefault()
    let nome = input.value
    criarItemLista(lista, nome)
    resetarInput(form)
}

const criarItemLista = (lista, nome) => {
    lista.innerHTML += `<li> ${nome} <button type='button'>Remover</button></li>`    
}

const resetarInput = form => form.reset()

const criarRemoveButton = evt => {
    if(evt.target.nodeName === "BUTTON"){
        const item = evt.target.parentNode;
        item.remove();
    }
}

form.addEventListener("submit", adicionarItem)
lista.addEventListener("click", criarRemoveButton)


