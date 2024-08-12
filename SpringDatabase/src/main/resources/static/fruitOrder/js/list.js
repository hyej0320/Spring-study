const getRandomFruitSaleCount = 
	remainQty => Math.floor(Math.random() * remainQty) + 1;

const saleButtonHandler = (e) => {
	const clickedButton = e.target;

	const fid = clickedButton.dataset.fid;
	const remainQty = clickedButton.dataset.remainQty;
	console.log(`판매해야 하는 과일ID: ${fid}`);
	console.log(`현재 남은 개수: ${remainQty}`);
	console.log(`랜덤으로 결정된 판매 개수: ${getRandomFruitSaleCount(remainQty)}`)
};

Array.from(document.getElementsByClassName("sale-btn"))
	.forEach((saleButton)=> {
		saleButton.addEventListener("click", saleButtonHandler)
	});