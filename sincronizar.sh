if [ -d "/media/pabsal/PABLO8G/Carpeta001/DATOS" ]; then
 device_name="Datos"
 folder_name="/media/pabsal/PABLO8G/Carpeta001/DATOS"
elif [ -d "/home/pabsal/Escritorio/Copia" ]; then
 device_name="Copia"
 folder_name="/home/pabsal/Escritorio/Copia"
else
 echo "Carpeta no encontrada"
 exit
fi

echo "Origen: $device_name"
echo "Destino: $folder_name"


rsync -av --delete --update /media/pabsal/PABLO8G/Carpeta001/DATOS /home/pabsal/Escritorio/Copia/
echo "Estas segur@ que quieres copiar la carpeta $device_name en la carpeta $folder_name"

echo "1-Si"
echo "2-No"

read $e;

if [$e ==1 ];
then
rsync -av --update  /home/pabsal/Escritorio/Copia/ /media/pabsal/PABLO8G/Carpeta001/DATOS
fi
echo "Fin"
