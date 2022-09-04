document.getElementById('image-to-save').addEventListener('change', saveImage)

function saveImage(e) {

    let file = e.target.files[0];
    const formData = new FormData();
    formData.append('file', file);
    fetch("http://localhost:8080/api/user/1/profile-picture", {
        method: 'POST',
        body: formData
    }).then(data => {

        document.getElementById("your-image").src = data.url + '?t=' + new Date().getTime();
    })

}