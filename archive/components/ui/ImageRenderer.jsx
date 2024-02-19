import Image from "next/image";

const ImageRenderer = ({ img }) => {
  return (
    <div>
      <Image src={img} alt="Picture of the author" width={500} height={500} />
    </div>
  );
};

export default ImageRenderer;
