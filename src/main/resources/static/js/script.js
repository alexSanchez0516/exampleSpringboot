function deleteC() {

	const href = document.querySelector('#deleteRef');
	if (confirm('¿Seguro de eliminar?')) {
		return
	} else {
		href.href = '';
	}

}