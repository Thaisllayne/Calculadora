const numeros = () =>{

  for (let i = 0; i <= 3; i++) {
    console.log("oi")

    let numeros = i;
    let tr = document.createElement("tr");
    tr.id = "num"
    tr.innerHTML = i
    document.querySelector("#tabela").appendChild(tr); 

    for (let j = 0; i<=3; j++){
      let td = document.createElement("td");
      document.querySelector("#num").appendChild(td);
    }

  }
}
