export interface SingleComment {
    id: number,
    content: string,
    children: SingleComment[]
}

export interface SingleCommentProps {
    comment: SingleComment;
    comments?: SingleComment[];
    setComments?: React.Dispatch<React.SetStateAction<SingleComment[]>>;
    ischild?: boolean;
}