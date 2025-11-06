<script>
    export let color = 'blue';
    export let texto = 'Boton';
</script>
<button style="background-color: {color};">
     {texto}
</button>

<style>
    button {
        color: white;
        border: none;
        padding: 10px 20px;
        font-size: 16px;
        cursor: pointer;
        border-radius: 5px;
    }
</style>
