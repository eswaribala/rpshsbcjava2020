
//event callback
window.addEventListener('load',function()
{
    let count = document.querySelector("aside").childElementCount;
    for(let i=1;i<=count;i++) {
        document.querySelector("aside > button:nth-child("+i+")")
            .addEventListener('click', function () {
            //alert(this.firstChild.nodeValue);
                if(i==1)
                {
                    //alert(this.firstChild.nodeValue);
                    ajaxFunction();
                }
        })
    }
})

//ajax function
function ajaxFunction(){
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
            //console.log(ajaxRequest.responseText);
            //convert json text to json object
            let response=JSON.parse(ajaxRequest.responseText);
            //response json array
            //console.log(response.items);
            //read object by object
            //arrow function
            response.items.forEach(obj=>{
                console.log(obj.volumeInfo.imageLinks.thumbnail);
            })

        }
    }

    ajaxRequest.open("GET",
        "https://www.googleapis.com/books/v1/volumes?q=corejava",
        true);
    ajaxRequest.send(null);
}


