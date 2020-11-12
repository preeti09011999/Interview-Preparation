int i=0,j=0,k=a.length-1;
while(j<=k){
  if(a[j] == 1){
    j++;
  } 
  else if(a[j] == 0){
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
    i++;
    j++;
  }
  else if(a[j] == 2){
    int temp = a[j];
    a[j] = a[k];
    a[k] = temp;
    k--;
  } 
}
