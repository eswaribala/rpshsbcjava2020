
//event callback
window.addEventListener('load',function()
{
    let content=document.querySelector("#content");

   let myAccount=document.querySelector("nav > ul > li:nth-child(3) > a")
    myAccount.addEventListener('click',function()
    {

        countryAjaxFunction();
        document.querySelector("#content div").style.display="block";
    })

    document.querySelector("#regForm").addEventListener('submit',
        function()
    {
        alert("Form submitted....");
    })

    let count = document.querySelector("aside").childElementCount;

    for(let i=1;i<=count;i++) {
        document.querySelector("aside > button:nth-child("+i+")")
            .addEventListener('click', function () {
            //alert(this.firstChild.nodeValue);
                if(i==1)
                {
                   while(content.hasChildNodes())
                      content.removeChild(content.firstChild);
                    //alert(this.firstChild.nodeValue);
                    bookAjaxFunction();
                }
                else if(i==2)
                {
                   while(content.hasChildNodes())
                      content.removeChild(content.firstChild);
                    //alert(this.firstChild.nodeValue);
                    giftAjaxFunction();
                }
                else if(i==3)
                {
                   while(content.hasChildNodes())
                      content.removeChild(content.firstChild);
                    //alert(this.firstChild.nodeValue);
                    clothesAjaxFunction();
                }
                else if(i==4)
                {
                   while(content.hasChildNodes())
                      content.removeChild(content.firstChild);
                    //alert(this.firstChild.nodeValue);
                    sportsAjaxFunction();
                }
        })
    }
})

//ajax function
function bookAjaxFunction(){
    let ajaxRequest;
    try{
        ajaxRequest = new XMLHttpRequest();
    } catch (e){
        try{
            ajaxRequest = new ActiveXObject("Msxml2.XMLHTTP3.0"); }
        catch (e){alert("Your browser broke!");
        return false;
        }
    }

    ajaxRequest.onreadystatechange = function(){
        if(ajaxRequest.readyState == 4 && ajaxRequest.status == 200){

            let table=document.createElement('table');
            let tr=document.createElement('tr');
            //console.log(ajaxRequest.responseText);
            //convert json text to json object
            let response=JSON.parse(ajaxRequest.responseText);
            //response json array
            //console.log(response.items);
            //read object by object
            //arrow function
            let count=0;
            response.items.forEach(obj=>{
                console.log(obj.volumeInfo.imageLinks.thumbnail);
                if (count<4) {
                    td = document.createElement('td');
                    img = new Image();
                    img.src = obj.volumeInfo.imageLinks.thumbnail;
                    img.width = 100;
                    img.height = 100;
                    td.appendChild(img);
                    tr.appendChild(td);
                    count++;
                }
                else
                {
                   table.appendChild(tr);
                    tr=document.createElement('tr');
                    count=0;
                }
            })

            table.appendChild(tr);
            let content=document.querySelector("#content");
            content.appendChild(table);


        }
    }

    ajaxRequest.open("GET",
        "https://www.googleapis.com/books/v1/volumes?q=springboot",
        true);
    ajaxRequest.send(null);
}

/*function giftAjaxFunction(){
    let ajaxRequest;
    try{
        ajaxRequest = new XMLHttpRequest();
    } catch (e){
        try{
            ajaxRequest = new ActiveXObject("Msxml2.XMLHTTP3.0"); }
        catch (e){alert("Your browser broke!");
        return false;
        }
    }

    ajaxRequest.onreadystatechange = function(){
        if(ajaxRequest.readyState == 4 && ajaxRequest.status == 200){

            let table=document.createElement('table');
            let tr=document.createElement('tr');
            //console.log(ajaxRequest.responseText);
            //convert json text to json object
            let response=JSON.parse(ajaxRequest.responseText);
            //response json array
            //console.log(response.items);
            //read object by object
            //arrow function
            let count=0;
            // response.items.forEach(obj=>{
            //     console.log(obj.volumeInfo.imageLinks.thumbnail);
            //     if (count<4) {
            //         td = document.createElement('td');
            //         img = new Image();
            //         img.src = obj.volumeInfo.imageLinks.thumbnail;
            //         img.width = 100;
            //         img.height = 100;
            //         td.appendChild(img);
            //         tr.appendChild(td);
            //         count++;
            //     }
            //     else
            //     {
            //        table.appendChild(tr);
            //         tr=document.createElement('tr');
            //         count=0;
            //     }
            // })
            tr.appendChild(response);

            table.appendChild(tr);
            let content=document.querySelector("#content");
            content.appendChild(table);


        }
    }

    ajaxRequest.open("GET",
        "https://serpapi.com/search.json?q=Apple&tbm=isch&ijn=0",
        true);
    // ajaxRequest.setRequestHeader('Access-Control-Allow-Origin','*');
    ajaxRequest.setRequestHeader("Access-Control-Allow-Origin", "*");
    ajaxRequest.setRequestHeader("Access-Control-Allow-Methods", "POST, GET");
    // ajaxRequest.setRequestHeader("Access-Control-Allow-Headers", "Origin,Accept,Content-Type");
    ajaxRequest.setRequestHeader("Access-Control-Max-Age", "3600");
    ajaxRequest.setRequestHeader("Content-Type", "application/json");
    ajaxRequest.send();
}*/

function giftAjaxFunction(){

    let table=document.createElement('table');
    let tr=document.createElement('tr');
    let count=0;
    for(count = 0; count < 8; count++){
        if (count%4 == 0 && count != 0) {
            table.appendChild(tr);
            tr=document.createElement('tr');
        }
        td = document.createElement('td');
        img = new Image();
        // console.log("../resources/images/sports/"+count+".jpg");
        img.src = "../resources/images/gifts/"+count+".jpg";
        img.width = 100;
        img.height = 100;
        td.appendChild(img);
        tr.appendChild(td);
    }

    table.appendChild(tr);
    let content=document.querySelector("#content");
    content.appendChild(table);
}

function clothesAjaxFunction(){

    let table=document.createElement('table');
    let tr=document.createElement('tr');
    let count=0;
    for(count = 0; count < 8; count++){
        if (count%4 == 0 && count != 0) {
            table.appendChild(tr);
            tr=document.createElement('tr');
        }
        td = document.createElement('td');
        img = new Image();
        // console.log("../resources/images/sports/"+count+".jpg");
        img.src = "../resources/images/clothes/"+count+".jpg";
        img.width = 100;
        img.height = 100;
        td.appendChild(img);
        tr.appendChild(td);
    }

    table.appendChild(tr);
    let content=document.querySelector("#content");
    content.appendChild(table);
}

function sportsAjaxFunction(){

    let table=document.createElement('table');
    let tr=document.createElement('tr');
    let count=0;
    for(count = 0; count < 8; count++){
        if (count%4 == 0 && count != 0) {
            table.appendChild(tr);
            tr=document.createElement('tr');
        }
        td = document.createElement('td');
        img = new Image();
        // console.log("../resources/images/sports/"+count+".jpg");
        img.src = "../resources/images/sports/"+count+".jpg";
        img.width = 100;
        img.height = 100;
        td.appendChild(img);
        tr.appendChild(td);
    }

    table.appendChild(tr);
    let content=document.querySelector("#content");
    content.appendChild(table);
}


function countryAjaxFunction(){
    let ajaxRequest;
    try{
        ajaxRequest = new XMLHttpRequest();
    } catch (e){
        try{
            ajaxRequest = new ActiveXObject("Msxml2.XMLHTTP3.0"); }
        catch (e){alert("Your browser broke!");
            return false;
        }
    }

    ajaxRequest.onreadystatechange = function(){
        if(ajaxRequest.readyState == 4 && ajaxRequest.status == 200){
            let response=JSON.parse(ajaxRequest.responseText);
            let dataList=document.querySelector("#countryList");
            response.forEach(obj=>{
               console.log(obj.name);
               option=document.createElement("option");
               text=document.createTextNode(obj.name);
               option.appendChild(text);
               dataList.appendChild(option);
              })
        }
    }

    ajaxRequest.open("GET",
        "https://restcountries.eu/rest/v2/all",
        true);
    ajaxRequest.send(null);
}
