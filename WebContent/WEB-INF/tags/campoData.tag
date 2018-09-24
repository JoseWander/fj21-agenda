<%@ attribute name="id" required="true"%>
<input id="${id}" name="${id}" readonly="readonly" />
<script>
$("#${id}").datepicker($.datepicker.regional["pt-BR"]);

</script>
